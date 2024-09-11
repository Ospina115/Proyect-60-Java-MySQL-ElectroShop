package com.tiendaelectrica.cruds.categorias.application;

import com.tiendaelectrica.cruds.categorias.domain.entity.Categoria;
import com.tiendaelectrica.cruds.categorias.domain.service.CategoriaService;

public class CreateCategoriaUseCase {

    // Este caso de uso llama al servicio CategoriaService para crear una categoría,
    // delegando la lógica de inserción de la categoría en la base de datos.
    private final CategoriaService categoriaService;

    public CreateCategoriaUseCase(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public void execute(Categoria categoria) {
        categoriaService.CreateCategoria(categoria);
    }
}
