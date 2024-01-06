import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Product } from '../model/product';
import { ProductService } from '../product.service';

@Component({
  selector: 'productlist-v3',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './productlist-v3.component.html',
  styleUrl: './productlist-v3.component.css'
})
export class ProductlistV3Component implements OnInit{

  products!:Product[];  
  productService: ProductService;



  constructor(productService: ProductService){
    this.productService=productService;        
  }


  ngOnInit(): void {
    this.products = this.productService.getAllProducts();
  }


}
