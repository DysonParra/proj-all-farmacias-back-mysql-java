/*
 * @fileoverview    {Farmacia}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Description of {@code Farmacia}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"farmacia\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Farmacia implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intCodigoFarmacia;
    private Long intIdBarrio;
    private String strCelular;
    private String strNit;
    private String strNombre;
    private String strTelefonoFijo;
    private String strUrlExtraccion;

}
