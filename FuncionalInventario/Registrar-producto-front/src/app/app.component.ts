import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormPostProductoComponent } from "./form-post-producto/form-post-producto.component";
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule, FormPostProductoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'inventario-producto-registrar';
}
