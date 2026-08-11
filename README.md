# openpmo-plugin-procurement-interface

Contrato compartilhado para integrações do OpenPMO com fontes externas de Licitações.

## Objetivo

Este projeto define uma API neutra para listar anos, órgãos, licitações e seus detalhes. A aplicação depende do contrato e cada ambiente fornece um plugin com a integração concreta.

Não fazem parte deste projeto chamadas HTTP, autenticação, parser de respostas, persistência ou regras do banco de dados do OpenPMO.

## Requisitos

- Java 11 ou superior;
- JitPack configurado no projeto consumidor.

## Instalação

```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.sep-es-br:openpmo-plugin-procurement-interface:1.0.0'
}
```

## Contrato do provider

```java
public interface IProcurementProvider {

    List<Long> getYears();

    List<ProcurementOrganizationDto> getOrganizations(Long year);

    List<ProcurementDto> getProcurements(
        Long year,
        ProcurementOrganizationDto organization
    );

    ProcurementDto getProcurement(Long processId);
}
```

| Método | Finalidade |
| --- | --- |
| `getYears()` | Lista os anos com Licitações disponíveis. |
| `getOrganizations(year)` | Lista os órgãos disponíveis no ano. |
| `getProcurements(year, organization)` | Lista as Licitações do órgão selecionado. |
| `getProcurement(processId)` | Obtém os detalhes de uma Licitação. |

## DTOs

### `ProcurementOrganizationDto`

| Campo | Descrição |
| --- | --- |
| `identifier` | Identificador do órgão na fonte externa. |
| `name` | Nome apresentado ao usuário. |

### `ProcurementDto`

| Campo | Tipo | Descrição |
| --- | --- | --- |
| `processId` | `Long` | Identificador da Licitação na fonte externa. |
| `processNumber` | `String` | Número do processo. |
| `organizationName` | `String` | Nome do órgão. |
| `year` | `Long` | Ano da Licitação. |
| `object` | `String` | Objeto da Licitação. |
| `modality` | `String` | Modalidade. |
| `status` | `String` | Situação atual. |
| `protocol` | `String` | Protocolo relacionado. |

## Criando uma implementação

```java
@Component
public class ExampleProcurementProvider implements IProcurementProvider {
    // Implementar as quatro operações do contrato.
}
```

Quando o consumidor utiliza descoberta por Spring, a implementação deve ser registrada como bean. O contrato não depende do Spring.

## Build local

```powershell
.\gradlew.bat clean build
```

```bash
./gradlew clean build
```
