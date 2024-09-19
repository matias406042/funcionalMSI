import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { InventarioService } from './service/inventario.service';
import { CommonModule } from '@angular/common';
import { Inventario } from './models/inventario';
import { provideHttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  providers: [],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'inventario-consulta';
  productos: Inventario[] = [];
  mostrarFormulario = false;

  constructor(private inventarioService: InventarioService) {}

  toggleForm() {
    this.mostrarFormulario = !this.mostrarFormulario;
    this.inventarioService.getAll().subscribe((data: Inventario[]) => {
      this.productos = data;
    });
  }
}
