package com.example.oblig3;

public class billett {
 private String film;
 private int antall;
 private String fornavn;
 private String etternavn;
 private String tlf; // Changed to String
 private String Epost;

 public billett(String film, int antall, String fornavn, String etternavn, String tlf, String Epost) {
  this.film = film;
  this.antall = antall;
  this.fornavn = fornavn;
  this.etternavn = etternavn;
  this.tlf = tlf;
  this.Epost = Epost;
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

 public String getTlf() {
  return tlf;
 }

 public void setTlf(String tlf) {
  this.tlf = tlf;
 }

 public String getEpost() {
  return Epost;
 }

 public void setEpost(String Epost) {
  this.Epost = Epost;
 }
}
