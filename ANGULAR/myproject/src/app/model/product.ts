export class Product {

    productName: string = "";
    productImage:string = "";
    price: number = 0;
    id:number=-1;

    constructor(id:number,productName: string,productImage:string,price: number ){
        this.id=id;
        this.productName=productName;
        this.productImage=productImage;
        this.price=price;
    }

}
