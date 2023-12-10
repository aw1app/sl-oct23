import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductV4 } from '../model/product-v4';
import { ProductServiceV4 } from '../product-service-v4.service';

@Component({
  selector: 'product-list-v4',
  standalone: true,
  imports: [CommonModule, HttpClientModule ],
  templateUrl: './product-list-v4.component.html',
  styleUrl: './product-list-v4.component.css'
})
export class ProductListV4Component {

  products:ProductV4[]=[];  
  productService: ProductServiceV4;

  constructor(productService: ProductServiceV4){
    this.productService=productService;        
  }

  ngOnInit(): void {
    this.productService.getAllProducts().subscribe(
      products => {
        this.products = products;
      },
      error => {
        console.error('Error fetching products:', error);
      }
    );
  }


}
