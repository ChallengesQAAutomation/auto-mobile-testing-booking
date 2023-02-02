Feature: Flujo de alojamiento

  Scenario: Reservar de habitacion en cusco
    Given John Wick quiere reservar 1 habitacion en "cusco"
    When en las fechas "14/Febrero" al "28/Feebrero"
    And para 2 personas adultas 1 menor de 5 anios
    And John realizo la reserva de la segunda opcion de resultado de busqueda
    And ingreso sus datos personales