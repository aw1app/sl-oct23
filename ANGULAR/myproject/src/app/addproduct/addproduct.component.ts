import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators  } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'addproduct',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule ],
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent {

  productForm!: FormGroup;
  
  isProductNameInvalid: boolean = false;
  isProductPriceInvalid: boolean = false;

  productService!:ProductService;

  constructor(private fb: FormBuilder, productService:ProductService){
    this.productService=productService;

    this.productForm = this.fb.group(
      {
        productName: ['', [Validators.required, Validators.minLength(3)]],
        productPrice: ['', [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/), Validators.max(100000)]]
      }
    ); 
      
  }

  addProduct():void{  
    this.productService.addProduct(this.productForm.value.productName,Number(this.productForm.value.productPrice));    
  }


}
