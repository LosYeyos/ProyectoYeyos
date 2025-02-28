package com.moviles.populators;

import com.moviles.model.entities.*;
import com.moviles.repositories.*;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@ConditionalOnProperty(name = "spring.jpa.hibernate.ddl-auto", havingValue = "create", matchIfMissing = false)
public class Populators {
    private MovilRepository movilRepository;
    private ModeloRepository modeloRepository;
    private MarcaRepository marcaRepository;
    private TecnologiaPantallaRepository tecnologiaPantallaRepository;
    private ProcesadorRepository procesadorRepository;

    public Populators(MovilRepository movilRepository, ModeloRepository modeloRepository, MarcaRepository marcaRepository, TecnologiaPantallaRepository tecnologiaPantallaRepository, ProcesadorRepository procesadorRepository) {
        this.movilRepository = movilRepository;
        this.modeloRepository = modeloRepository;
        this.marcaRepository = marcaRepository;
        this.tecnologiaPantallaRepository = tecnologiaPantallaRepository;
        this.procesadorRepository = procesadorRepository;
    }

    @PostConstruct
    void populate() {
        Marca samsung = new Marca();
        samsung.setNombre("Samsung");
        marcaRepository.save(samsung);

        Modelo galaxyS21 = new Modelo();
        galaxyS21.setMarca(samsung);
        galaxyS21.setReferencia(2021);
        galaxyS21.setNombre("Galaxy S21");
        modeloRepository.save(galaxyS21);

        TecnologiaPantalla oled = new TecnologiaPantalla();
        oled.setReferencia(101);
        oled.setTipo("OLED");
        tecnologiaPantallaRepository.save(oled);

        Procesador exynos2100 = new Procesador();
        exynos2100.setReferencia(2100);
        exynos2100.setNombre("Exynos 2100");
        exynos2100.setNumeroNucleos(8);
        exynos2100.setMaxGHz(2.9);
        procesadorRepository.save(exynos2100);

        Movil movil1 = new Movil();
        movil1.setModelo(galaxyS21);
        movil1.setProcesador(exynos2100);
        movil1.setTecnologiaPantalla(oled);
        movil1.setAlmacenamiento(128);
        movil1.setTamanoPantalla(6.2);
        movil1.setRAM(8);
        movil1.setDimensiones("151.7 x 71.2 x 7.9 mm");
        movil1.setPeso(169);
        movil1.setCapacidadPantalla(2400);
        movil1.setBateria(4000);
        movil1.setNFC(true);
        movil1.setPrecio(799.99);
        movil1.setFechaLanzamiento(LocalDate.of(2021, 1, 29));
        movilRepository.save(movil1);

        Marca apple = new Marca();
        apple.setNombre("Apple");
        marcaRepository.save(apple);

        Modelo iphone12 = new Modelo();
        iphone12.setMarca(apple);
        iphone12.setReferencia(2020);
        iphone12.setNombre("iPhone 12");
        modeloRepository.save(iphone12);

        TecnologiaPantalla retina = new TecnologiaPantalla();
        retina.setReferencia(102);
        retina.setTipo("Retina");
        tecnologiaPantallaRepository.save(retina);

        Procesador a14 = new Procesador();
        a14.setReferencia(1400);
        a14.setNombre("A14 Bionic");
        a14.setNumeroNucleos(6);
        a14.setMaxGHz(3.1);
        procesadorRepository.save(a14);

        Movil movil2 = new Movil();
        movil2.setModelo(iphone12);
        movil2.setProcesador(a14);
        movil2.setTecnologiaPantalla(retina);
        movil2.setAlmacenamiento(256);
        movil2.setTamanoPantalla(6.1);
        movil2.setRAM(6);
        movil2.setDimensiones("146.7 x 71.5 x 7.4 mm");
        movil2.setPeso(164);
        movil2.setCapacidadPantalla(2532);
        movil2.setBateria(2815);
        movil2.setNFC(true);
        movil2.setPrecio(999.99);
        movil2.setFechaLanzamiento(LocalDate.of(2020, 10, 23));
        movilRepository.save(movil2);

        Marca google = new Marca();
        google.setNombre("Google");
        marcaRepository.save(google);

        Modelo pixel5 = new Modelo();
        pixel5.setMarca(google);
        pixel5.setReferencia(2020);
        pixel5.setNombre("Pixel 5");
        modeloRepository.save(pixel5);

        TecnologiaPantalla amoled = new TecnologiaPantalla();
        amoled.setReferencia(103);
        amoled.setTipo("AMOLED");
        tecnologiaPantallaRepository.save(amoled);

        Procesador snapdragon765G = new Procesador();
        snapdragon765G.setReferencia(7650);
        snapdragon765G.setNombre("Snapdragon 765G");
        snapdragon765G.setNumeroNucleos(8);
        snapdragon765G.setMaxGHz(2.4);
        procesadorRepository.save(snapdragon765G);

        Movil movil3 = new Movil();
        movil3.setModelo(pixel5);
        movil3.setProcesador(snapdragon765G);
        movil3.setTecnologiaPantalla(amoled);
        movil3.setAlmacenamiento(128);
        movil3.setTamanoPantalla(6.0);
        movil3.setRAM(8);
        movil3.setDimensiones("144.7 x 70.4 x 8 mm");
        movil3.setPeso(151);
        movil3.setCapacidadPantalla(2340);
        movil3.setBateria(4080);
        movil3.setNFC(true);
        movil3.setPrecio(699.99);
        movil3.setFechaLanzamiento(LocalDate.of(2020, 10, 15));
        movilRepository.save(movil3);

        Marca oneplus = new Marca();
        oneplus.setNombre("OnePlus");
        marcaRepository.save(oneplus);

        Modelo oneplus8T = new Modelo();
        oneplus8T.setMarca(oneplus);
        oneplus8T.setReferencia(2020);
        oneplus8T.setNombre("OnePlus 8T");
        modeloRepository.save(oneplus8T);

        TecnologiaPantalla fluidAmoled = new TecnologiaPantalla();
        fluidAmoled.setReferencia(104);
        fluidAmoled.setTipo("Fluid AMOLED");
        tecnologiaPantallaRepository.save(fluidAmoled);

        Procesador snapdragon865 = new Procesador();
        snapdragon865.setReferencia(8650);
        snapdragon865.setNombre("Snapdragon 865");
        snapdragon865.setNumeroNucleos(8);
        snapdragon865.setMaxGHz(2.84);
        procesadorRepository.save(snapdragon865);

        Movil movil4 = new Movil();
        movil4.setModelo(oneplus8T);
        movil4.setProcesador(snapdragon865);
        movil4.setTecnologiaPantalla(fluidAmoled);
        movil4.setAlmacenamiento(256);
        movil4.setTamanoPantalla(6.55);
        movil4.setRAM(12);
        movil4.setDimensiones("160.7 x 74.1 x 8.4 mm");
        movil4.setPeso(188);
        movil4.setCapacidadPantalla(2400);
        movil4.setBateria(4500);
        movil4.setNFC(true);
        movil4.setPrecio(749.99);
        movil4.setFechaLanzamiento(LocalDate.of(2020, 10, 14));
        movilRepository.save(movil4);

        Marca xiaomi = new Marca();
        xiaomi.setNombre("Xiaomi");
        marcaRepository.save(xiaomi);

        Modelo mi11 = new Modelo();
        mi11.setMarca(xiaomi);
        mi11.setReferencia(2021);
        mi11.setNombre("Mi 11");
        modeloRepository.save(mi11);

        TecnologiaPantalla superAmoled = new TecnologiaPantalla();
        superAmoled.setReferencia(105);
        superAmoled.setTipo("Super AMOLED");
        tecnologiaPantallaRepository.save(superAmoled);

        Procesador snapdragon888 = new Procesador();
        snapdragon888.setReferencia(8880);
        snapdragon888.setNombre("Snapdragon 888");
        snapdragon888.setNumeroNucleos(8);
        snapdragon888.setMaxGHz(2.84);
        procesadorRepository.save(snapdragon888);

        Movil movil5 = new Movil();
        movil5.setModelo(mi11);
        movil5.setProcesador(snapdragon888);
        movil5.setTecnologiaPantalla(superAmoled);
        movil5.setAlmacenamiento(256);
        movil5.setTamanoPantalla(6.81);
        movil5.setRAM(8);
        movil5.setDimensiones("164.3 x 74.6 x 8.1 mm");
        movil5.setPeso(196);
        movil5.setCapacidadPantalla(3200);
        movil5.setBateria(4600);
        movil5.setNFC(true);
        movil5.setPrecio(799.99);
        movil5.setFechaLanzamiento(LocalDate.of(2021, 1, 1));
        movilRepository.save(movil5);

        Marca huawei = new Marca();
        huawei.setNombre("Huawei");
        marcaRepository.save(huawei);

        Modelo p40Pro = new Modelo();
        p40Pro.setMarca(huawei);
        p40Pro.setReferencia(2020);
        p40Pro.setNombre("P40 Pro");
        modeloRepository.save(p40Pro);

        TecnologiaPantalla quadCurve = new TecnologiaPantalla();
        quadCurve.setReferencia(106);
        quadCurve.setTipo("Quad-Curve Overflow Display");
        tecnologiaPantallaRepository.save(quadCurve);

        Procesador kirin990 = new Procesador();
        kirin990.setReferencia(9900);
        kirin990.setNombre("Kirin 990 5G");
        kirin990.setNumeroNucleos(8);
        kirin990.setMaxGHz(2.86);
        procesadorRepository.save(kirin990);

        Movil movil6 = new Movil();
        movil6.setModelo(p40Pro);
        movil6.setProcesador(kirin990);
        movil6.setTecnologiaPantalla(quadCurve);
        movil6.setAlmacenamiento(256);
        movil6.setTamanoPantalla(6.58);
        movil6.setRAM(8);
        movil6.setDimensiones("158.2 x 72.6 x 8.95 mm");
        movil6.setPeso(209);
        movil6.setCapacidadPantalla(2640);
        movil6.setBateria(4200);
        movil6.setNFC(true);
        movil6.setPrecio(999.99);
        movil6.setFechaLanzamiento(LocalDate.of(2020, 4, 7));
        movilRepository.save(movil6);
    }
}
