import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormPostProductoComponent } from './form-post-producto.component';

describe('FormPostProductoComponent', () => {
  let component: FormPostProductoComponent;
  let fixture: ComponentFixture<FormPostProductoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormPostProductoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormPostProductoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
