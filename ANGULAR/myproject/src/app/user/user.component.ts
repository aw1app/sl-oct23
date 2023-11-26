import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'user',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {
  firstName:string="Sujata";
   lastName:string="Sharma";;
    age:number=35;
}
