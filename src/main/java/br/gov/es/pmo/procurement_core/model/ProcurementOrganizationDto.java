package br.gov.es.pmo.procurement_core.model;
public class ProcurementOrganizationDto {
 private String identifier; private String name;
 public ProcurementOrganizationDto() {}
 public ProcurementOrganizationDto(String identifier, String name) { this.identifier=identifier; this.name=name; }
 public String getIdentifier(){return identifier;} public void setIdentifier(String v){identifier=v;}
 public String getName(){return name;} public void setName(String v){name=v;}
}
