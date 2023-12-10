import { Component, Input, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductServiceV4 } from '../product-service-v4.service';
import { ProductV4 } from '../model/product-v4';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'product-v4',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './product-component-v4.component.html',
  styleUrl: './product-component-v4.component.css'
})
export class ProductComponentV4 implements OnInit {

  product!: ProductV4;
  productService: ProductServiceV4;
  route!: ActivatedRoute;

  @Input('productId') productId!: string;

  constructor(productService: ProductServiceV4, route: ActivatedRoute) {
    this.productService = productService;
  }


  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      console.log(params.get('productId'));
      
      const productId = params.get('productId');
      if (productId !== null) {
        this.productId = productId;
        
        // Now you can use this.productId to fetch it from the Service
        this.productService.getProduct(this.productId).subscribe(
          product => {
            this.product = product;
          },
          error => {
            console.error('Error fetching product:', error);
          }
        );
      }
    });
  }

  ngOnDestroy() {
    //this.productService.unsubscribe();
  }


}
