import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductlistV3Component } from './productlist-v3.component';

describe('ProductlistV3Component', () => {
  let component: ProductlistV3Component;
  let fixture: ComponentFixture<ProductlistV3Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductlistV3Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ProductlistV3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
