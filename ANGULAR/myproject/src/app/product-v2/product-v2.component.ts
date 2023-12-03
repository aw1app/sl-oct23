import { Component, Input, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Product } from '../model/product';

@Component({
  selector: 'product-v2',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './product-v2.component.html',
  styleUrl: './product-v2.component.css'
})
export class ProductV2Component  implements OnInit {

  product:Product=new Product(
  "Lenova Mouse",
  "https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png",
   500);

   f1 = (arg1:string) => {console.log(`Inside F1 ${arg1}`)};

  
  @Input("name")
  name!:string;

  ngOnInit():void {
    this.product.productName = this.name;
  }
    
}
