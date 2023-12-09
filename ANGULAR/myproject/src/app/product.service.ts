import { Injectable } from '@angular/core';
import { Product } from './model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products!: Product[];

  constructor() {
    this.products = [
      new Product(1, "Lenova Mouse", "https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 500),
      new Product(2, "Lenova Keyboard", "https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 2500),
      new Product(3, "HP Laptop", "https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 1500),
      new Product(4, "Dell Monitor", "https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 3500),
    ]
  }

  // CRUD
  getProduct = (id: number): Product => {
    console.log("Inside getProduct() id=" + id);
    return this.products[id];
  }

  // All product
  getAllProducts = (): Product[] => {
    return this.products;
  }

  getProductsFromTo = (i: number, j: number): Product[] => {
    let productsPartialList: Product[] = [];
    let counter: number = 0;

    for (let a: number = i; a < j; a++) {
      productsPartialList[counter++] = this.products[a];
    }

    return productsPartialList;
  }

  // Create / Add a new product
  addProduct = (name: string, price: number): void => {
    console.log("Inside Product Service addProduct");
    let new_product: Product = new Product(this.products.length+1, name, "http://someimage.jpg", price);
    this.products.push(new_product);
  }


}
