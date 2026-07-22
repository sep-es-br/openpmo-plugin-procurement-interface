package br.gov.es.pmo.procurement_core.model;
import java.util.List;
public interface IProcurementProvider {
 List<Long> getYears();
 List<ProcurementOrganizationDto> getOrganizations(Long year);
 List<ProcurementDto> getProcurements(Long year, ProcurementOrganizationDto organization);
 ProcurementDto getProcurement(Long processId);
}
