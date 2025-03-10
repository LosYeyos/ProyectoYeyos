package com.moviles.om;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.Anuncio;
import com.moviles.model.entities.Movil;
import com.moviles.model.entities.Solicitud;
import com.moviles.model.entities.Usuario;
import com.moviles.model.entities.enums.EstadoSolicitud;

public class SolicitudOM {

	private MovilOM movilOM;

	private AnuncioOM anuncioOM;

	private UsuariosOM usuariosOM;

	private List<Usuario> usuarios;
	private List<Movil> moviles;
	private List<Anuncio> anuncios;

	public SolicitudOM() {
		super();
		this.movilOM = new MovilOM();
		this.anuncioOM = new AnuncioOM();
		this.usuariosOM = new UsuariosOM();
	}

	public SolicitudOM(MovilOM movilOM, AnuncioOM anuncioOM, UsuariosOM usuariosOM) {
		super();
		this.movilOM = movilOM;
		this.anuncioOM = anuncioOM;
		this.usuariosOM = usuariosOM;
	}

	public List<Solicitud> getData() {
		List<Solicitud> solicitudes = new ArrayList<>();
		this.usuarios = usuariosOM.getData();
		this.anuncios = anuncioOM.getData();
		this.moviles = movilOM.getData();

		Solicitud solicitud = new Solicitud();
		solicitud.setAnuncio(anuncios.get(0));
		solicitud.setUsuarioSolicitante(usuarios.get(0));
		solicitud.setMensaje("Mensaje de solicitud");
		solicitud.setEstado(EstadoSolicitud.CONTESTADA);
		solicitud.setFechaSolicitud(LocalDate.now());
		solicitudes.add(solicitud);

		Solicitud solicitud2 = new Solicitud();
		solicitud2.setAnuncio(anuncios.get(1));
		solicitud2.setUsuarioSolicitante(usuarios.get(1));
		solicitud2.setMensaje("Mensaje de solicitud 2");
		solicitud2.setEstado(EstadoSolicitud.CERRADA);
		solicitud2.setFechaSolicitud(LocalDate.now());
		solicitudes.add(solicitud2);

		Solicitud solicitud3 = new Solicitud();
		solicitud3.setAnuncio(anuncios.get(2));
		solicitud3.setUsuarioSolicitante(usuarios.get(2));
		solicitud3.setMensaje("Mensaje de solicitud 3");
		solicitud3.setEstado(EstadoSolicitud.PENDIENTE);
		solicitud3.setFechaSolicitud(LocalDate.now());
		solicitudes.add(solicitud3);

		Solicitud solicitud4 = new Solicitud();
		solicitud4.setAnuncio(anuncios.get(3));
		solicitud4.setUsuarioSolicitante(usuarios.get(3));
		solicitud4.setMensaje("Mensaje de solicitud 4");
		solicitud4.setEstado(EstadoSolicitud.CONTESTADA);
		solicitud4.setFechaSolicitud(LocalDate.now());
		solicitudes.add(solicitud4);

		return solicitudes;
	}
}
