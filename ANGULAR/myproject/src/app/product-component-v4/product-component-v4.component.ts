import { Component, Input, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductServiceV4 } from '../product-service-v4.service';
import { ProductV4 } from '../model/product-v4';

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

  @Input('productId') productId!: string;

  constructor(productService: ProductServiceV4) {
    this.productService = productService;
  }


  ngOnInit(): void {
    this.productService.getProduct(this.productId)
      .subscribe(
        product => {
          this.product = product;
        },
        error => {
          console.error(`Error ${error} fetching product with id=${this.productId}:`);
        });
  }

}
