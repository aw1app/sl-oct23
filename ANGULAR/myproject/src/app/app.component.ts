import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';
import { ProductV2Component } from './product-v2/product-v2.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { ProductV3Component } from './product-v3/product-v3.component';
import { ProductlistV3Component } from './productlist-v3/productlist-v3.component';
import { AddproductComponent } from './addproduct/addproduct.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, ProductComponent, UserComponent, ProductV2Component,
     ProductlistComponent,ProductV3Component,ProductlistV3Component, AddproductComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title1 = 'MY GREAT GREAT ANGULAR CODE';

  username="user100";
  age=56;

  varX:boolean=true;

  parentFunctionF1=(evt:any)=>alert("Inside parentFunctionF1() " + evt);


  // NgSwitch Directive demo start
  arr: number[] =[1,2,3];
  arrlen!: number;

  getLength(): number{
    this.arrlen = this.arr.length;
    return this.arr.length;
    }

   // NgSwitch Directive demo end  
}
