import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

public class Main {

    public static void main(String[] args) {
    	 	
    	
        Region region = Region.US_EAST_1; // Change to your preferred region
        
        S3Client s3 = S3Client.builder()
                .region(region)
                .credentialsProvider(ProfileCredentialsProvider.create())
                .build();

        String bucketName = "odluser1366209-bucket1"; // Change to your desired bucket name

        // List Buckets
        listBuckets(s3);

        // Create a Bucket
        //createBucket(s3, bucketName);

        // List Buckets again to see the new bucket
        //listBuckets(s3);

        // Delete the Bucket
        //deleteBucket(s3, "sl-bucket1-2-jun-24-abc1111");

        // List Buckets again to see the bucket removed
        //listBuckets(s3);
        
     // List the contents of the bucket
        listBucketContents(s3, bucketName);

        s3.close();
    }

    public static void listBuckets(S3Client s3) {
        System.out.println("Listing buckets...");
        ListBucketsRequest listBucketsRequest = ListBucketsRequest.builder().build();
        ListBucketsResponse listBucketsResponse = s3.listBuckets(listBucketsRequest);
        listBucketsResponse.buckets().forEach(bucket -> System.out.println(bucket.name()));
    }

//    public static void createBucket(S3Client s3, String bucketName) {
//        System.out.println("Creating bucket: " + bucketName);
//        CreateBucketRequest createBucketRequest = CreateBucketRequest.builder()
//                .bucket(bucketName)
//                .createBucketConfiguration(CreateBucketConfiguration.builder()
//                        .locationConstraint(s3.region().id())
//                        .build())
//                .build();
//
//        s3.createBucket(createBucketRequest);
//        System.out.println("Bucket created: " + bucketName);
//    }

    public static void deleteBucket(S3Client s3, String bucketName) {
        System.out.println("Deleting bucket: " + bucketName);
        DeleteBucketRequest deleteBucketRequest = DeleteBucketRequest.builder()
                .bucket(bucketName)
                .build();

        s3.deleteBucket(deleteBucketRequest);
        System.out.println("Bucket deleted: " + bucketName);
    }
    
    
    public static void listBucketContents(S3Client s3, String bucketName) {
        System.out.println("Listing contents of bucket: " + bucketName);

        ListObjectsV2Request listObjectsV2Request = ListObjectsV2Request.builder()
                .bucket(bucketName)
                .build();

        ListObjectsV2Response listObjectsV2Response;

        do {
            listObjectsV2Response = s3.listObjectsV2(listObjectsV2Request);

            for (S3Object s3Object : listObjectsV2Response.contents()) {
                System.out.println(" - " + s3Object.key() + " (size: " + s3Object.size() + ")");
            }

            // Set the continuation token to retrieve the next page of results
            listObjectsV2Request = listObjectsV2Request.toBuilder()
                    .continuationToken(listObjectsV2Response.nextContinuationToken())
                    .build();

        } while (listObjectsV2Response.isTruncated());
    }
}
