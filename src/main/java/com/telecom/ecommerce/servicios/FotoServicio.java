package com.telecom.ecommerce.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.telecom.ecommerce.entidades.Foto;
import com.telecom.ecommerce.errores.ErrorServicio;
import com.telecom.ecommerce.repositorios.IFotoDAO;

@Service
public class FotoServicio {

	@Autowired
	private IFotoDAO fotoDAO;
	
	public void guardar(MultipartFile archivo) throws ErrorServicio{
		if(archivo != null) {
			try {
				Foto foto = new Foto();
				foto.setMime(archivo.getContentType());
				foto.setNombre(archivo.getName());
				foto.setContenido(archivo.getBytes());
				
				fotoDAO.save(foto);
			}catch(Exception e) {
				System.out.println("No se pudo guardar la foto " + e.getMessage());
			}
		}
	}
	
	public void actualizar(Integer idFoto, MultipartFile archivo) throws ErrorServicio{
		if(archivo != null) {
			try {
				Foto foto = new Foto();
				if(idFoto != null) {
					Optional<Foto> respuesta = fotoDAO.findById(idFoto);
					if(respuesta.isPresent()) {
						foto = respuesta.get();
					}
				}
				foto.setMime(archivo.getContentType());
				foto.setNombre(archivo.getName());
				foto.setContenido(archivo.getBytes());
				
				fotoDAO.save(foto);
			}catch(Exception e) {
				System.out.println("No se pudo actualizar la foto " + e.getMessage());
			}
		}
	}
}
