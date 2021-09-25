$(document).ready(function(){
    $("#nav").load("http://localhost:8080/web/");
    CargarCalendario();
});



var myCircle1 = Circles.create({
    id:                  'circles-1',
    radius:              50,
    value:               1,
    maxValue:            100,
    width:               10,
    text:                function(value){return value-1 + '%';},
    colors:              ['#eeeeee', '#ff9f00'],
    duration:            400,
    wrpClass:            'circles-wrp',
    textClass:           'circles-text',
    valueStrokeClass:    'circles-valueStroke',
    maxValueStrokeClass: 'circles-maxValueStroke',
    styleWrapper:        true,
    styleText:           true
  });

  var myCircle2 = Circles.create({
    id:                  'circles-2',
    radius:              50,
    value:               1,
    maxValue:            100,
    width:               10,
    text:                function(value){return value-1 + '%';},
    colors:              ['#eeeeee', '#4cc790'],
    duration:            400,
    wrpClass:            'circles-wrp',
    textClass:           'circles-text',
    valueStrokeClass:    'circles-valueStroke',
    maxValueStrokeClass: 'circles-maxValueStroke',
    styleWrapper:        true,
    styleText:           true
  });

  var myCircle3 = Circles.create({
    id:                  'circles-3',
    radius:              50,
    value:               1,
    maxValue:            100,
    width:               10,
    text:                function(value){return value-1 + '%';},
    colors:              ['#eeeeee', '#3c9ee5'],
    duration:            400,
    wrpClass:            'circles-wrp',
    textClass:           'circles-text',
    valueStrokeClass:    'circles-valueStroke',
    maxValueStrokeClass: 'circles-maxValueStroke',
    styleWrapper:        true,
    styleText:           true
  });


  google.charts.load("current", {packages:["corechart"]});
  google.charts.setOnLoadCallback(drawChart);
  function drawChart() {
    var data = google.visualization.arrayToDataTable([
      ['XX', 'IMPORTE'],
      ['2018', 355.0816]
      ]);

    var options = {
      title: 'ESTADISTICA DE COMPRAS - Importe',
      legend: { position: 'none' },
      colors:['2A8A83'],
      backgroundColor:'transparent',hAxis:{title:"PERIODO"}
    };

    var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
    chart.draw(data, options);
  }

  google.charts.setOnLoadCallback(drawChart2);
  function drawChart2() {
    var data = google.visualization.arrayToDataTable([
      ['XX', 'IMPORTE'],
      ['2018', 248.00]
      ]);

    var options = {
      title: 'ESTADISTICA DE COMPRAS - Puntos',
      legend: { position: 'none' },
      colors:['2A8A83'],
      backgroundColor:'transparent',hAxis:{title:"PERIODO"}
    };

    var chart = new google.visualization.ColumnChart(document.getElementById('chart_div2'));
    chart.draw(data, options);
  }

  google.charts.setOnLoadCallback(drawChart3);
  function drawChart3() {
    var data = google.visualization.arrayToDataTable([
      ['XX', 'IMPORTE'],
      ['2018', 248.00]
      ]);

    var options = {
      title: 'ESTADISTICA DE COMPRAS - Valor negocio',
      legend: { position: 'none' },
      colors:['2A8A83'],
      backgroundColor:'transparent',hAxis:{title:"PERIODO"}
    };

    var chart = new google.visualization.ColumnChart(document.getElementById('chart_div3'));
    chart.draw(data, options);
  }

  const MESES = [
    "Enero",
    "Febrero",
    "Marzo",
    "Abril",
    "Mayo",
    "Junio",
    "Julio",
    "Agosto",
    "Septiembre",
    "Octubre",
    "Noviembre",
    "Diciembre",
  ];
  const f = new Date();
  function CargarCalendario(){
     $("#MesAnio").text(MESES[f.getMonth()]+" "+f.getFullYear())
    
  new Calendar({
    id: '#color-calendar',
})
   }

 

