import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductComponentV4Component } from './product-component-v4.component';

describe('ProductComponentV4Component', () => {
  let component: ProductComponentV4Component;
  let fixture: ComponentFixture<ProductComponentV4Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductComponentV4Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ProductComponentV4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
