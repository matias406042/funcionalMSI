import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ProductoService } from '../Services/producto.service';
import { Producto } from '../Models/producto';

@Component({
  selector: 'app-form-post-producto',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './form-post-producto.component.html',
  styleUrl: './form-post-producto.component.css'
})
export class FormPostProductoComponent {
  nombre: string = '';
  reusable: boolean = false;

  constructor(private productoService: ProductoService) {}

  enviarFormulario() {
    if (this.nombre) {
      const nuevoProducto: Producto = {
        name: this.nombre,
        reusable: this.reusable
      };

      this.productoService.crearProducto(nuevoProducto).subscribe(
        response => {
          
          console.log('Producto creado:', response);
          this.limpiarFormulario();
          alert('Producto cargado con éxito!');
         
          
          
        },
        error => {
          alert(error.error.message)
          console.error('Error al crear el producto:', error);
         
        }
      );
    } else {
      alert('El nombre del producto es requerido.');
    }

   
  }

  limpiarFormulario() {
    this.nombre = '';
    this.reusable = false;
  }
}
