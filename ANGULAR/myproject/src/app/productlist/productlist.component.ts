import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Product } from '../model/product';

@Component({
  selector: 'productlist',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './productlist.component.html',
  styleUrl: './productlist.component.css'
})
export class ProductlistComponent {

  products!:Product[];

  constructor(){
    this.products=[
      new Product("Lenova Mouse","https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 500),
      new Product("Lenova Keyboard","https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 2500),
      new Product("HP Laptop","https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 1500),
      new Product("Dell Monitor","https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 3500),
    ]
  }

}
