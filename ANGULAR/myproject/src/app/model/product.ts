export class Product {

    productName: string = "HP Laptop";
    productImage:string = "https://in-media.apjonlinecdn.com/magefan_blog/Laptop.jpg";
    price: number = 1000;

    constructor(productName: string,productImage:string,price: number ){
        this.productName=productName;
        this.productImage=productImage;
        this.price=price;
    }

}
