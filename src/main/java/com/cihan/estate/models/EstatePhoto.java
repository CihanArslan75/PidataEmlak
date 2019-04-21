package com.cihan.estate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estatephoto")
public class EstatePhoto {
	private Integer id;
	private Estate estate;
	private byte[] estateImage;
	
	@Id
	@SequenceGenerator(name = "seq_estateimage", allocationSize = 1, sequenceName = "seq_estateimage")
	@GeneratedValue(generator = "seq_estateimage", strategy = GenerationType.SEQUENCE)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne  //birden fazla photo bir emlağa bağlanabilir.bir emlağın birden fazla fotosu olabilir. Bir foto birden fazla emlağa bağlanamaz.
	@JoinColumn(name = "estateid", referencedColumnName = "id")
	public Estate getEstate() {
		return estate;
	}
	public void setEstate(Estate estate) {
		this.estate = estate;
	}
	
	@Lob
	@Column(name="estateimage")
	public byte[] getEstateImage() {
		return estateImage;
	}
	public void setEstateImage(byte[] estateImage) {
		this.estateImage = estateImage;
	}
	
	

}
