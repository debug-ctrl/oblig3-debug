package com.example.oblig3;

public class billett {
 private String film;
 private int antall;
 private String fornavn;
 private String etternavn;
 private int tlf;
 private String epost;

 public billett(String film, int antall, String fornavn, String etternavn, int tlf, String epost) {
  this.film = film;
  this.antall = antall;
  this.fornavn = fornavn;
  this.etternavn = etternavn;
  this.tlf = tlf;
  epost = epost;
 }

 public String getFilm() {
  return film;
 }

 public void setFilm(String film) {
  this.film = film;
 }

 public int getAntall() {
  return antall;
 }

 public void setAntall(int antall) {
  this.antall = antall;
 }

 public String getFornavn() {
  return fornavn;
 }

 public void setFornavn(String fornavn) {
  this.fornavn = fornavn;
 }

 public String getEtternavn() {
  return etternavn;
 }

 public void setEtternavn(String etternavn) {
  this.etternavn = etternavn;
 }

 public int getTlf() {
  return tlf;
 }

 public void setTlf(int tlf) {
  this.tlf = tlf;
 }

 public String getEpost() {
  return epost;
 }

 public void setEpost(String Epost) {
  this.epost = Epost;
 }
}
