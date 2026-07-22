package br.gov.es.pmo.procurement_core.model;
public class ProcurementDto {
 private Long processId; private String processNumber; private String organizationName; private Long year;
 private String object; private String modality; private String status; private String protocol;
 public Long getProcessId(){return processId;} public void setProcessId(Long v){processId=v;}
 public String getProcessNumber(){return processNumber;} public void setProcessNumber(String v){processNumber=v;}
 public String getOrganizationName(){return organizationName;} public void setOrganizationName(String v){organizationName=v;}
 public Long getYear(){return year;} public void setYear(Long v){year=v;}
 public String getObject(){return object;} public void setObject(String v){object=v;}
 public String getModality(){return modality;} public void setModality(String v){modality=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public String getProtocol(){return protocol;} public void setProtocol(String v){protocol=v;}
}
