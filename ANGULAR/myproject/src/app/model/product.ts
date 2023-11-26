export class Product {

    productName: string = "";
    productImage:string = "";
    price: number = 0;

    constructor(productName: string,productImage:string,price: number ){
        this.productName=productName;
        this.productImage=productImage;
        this.price=price;
    }

}
