package com.example.dimed.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * DTO para dados de  Itinerario.
 *
 * @author rodrigo
 * @version 1.0.0
 * @since 1.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItinerarioDto extends DimedDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8702600946585126985L;
	
	@NotEmpty
	private Long id;
	
	private String nome;
	
	private List<LatLongDto> coordenadas;

	
	@Override
	public String toString() {
		return "ItinerarioDto [id=" + id + ", nome=" + nome + ", itinerario=" + coordenadas.toString() + "]";
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<LatLongDto> getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(List<LatLongDto> coordenadas) {
		this.coordenadas = coordenadas;
	}
	

}
