//console.log('file loaded');

document.getElementById('btn').onclick = function(){

    var p = document.querySelector('.txt1').value;
    var c = document.querySelector('.txt2').value;
    var m =document.querySelector('.txt3').value;
   // console.log(m , isNaN(m));
    if (p==""|| c==""||m==""){
        alert('enter a value');
    }else if(isNaN(p)|| isNaN(c)||isNaN(m)){
        alert('enter a valid value');
    }else{
       p=  parseInt(p);
       c = parseFloat(c);
       m= Number(m);

       var total = p+c+m;
       var percentage = total /300*100;
       console.log(total);
       console.log(percentage);
    
       
        // best way to use if else code in short 
       var pf = percentage > 35 ? 'You are pass..':'You failed. Best of luck..';
       console.log(pf);


       

       console.log(document.querySelector('#r1'));
       console.log(document.querySelector('.r2'));
       percentage= percentage.toFixed(2);
       console.log(document.querySelector('#r3'));

       document.querySelector('#r1').innerHTML = total;
       document.querySelector('.r2').innerHTML = percentage + '%';
       document.getElementById('r3').innerHTML = pf;
       //Graph Start 
       Highcharts.chart('container', {
        chart: {
            type: 'pie'
        },
        title: {
            text: 'Marks Distribution'
        },
        tooltip: {
            valueSuffix: '%'
        },
        
        plotOptions: {
            series: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: [{
                    enabled: true,
                    distance: 20
                }, {
                    enabled: true,
                    distance: -40,
                    format: '{point.percentage:.1f}%',
                    style: {
                        fontSize: '1.2em',
                        textOutline: 'none',
                        opacity: 0.7
                    },
                    filter: {
                        operator: '>',
                        property: 'percentage',
                        value: 10
                    }
                }]
            }
        },
        series: [
            {
                name: 'Percentage',
                colorByPoint: true,
                data: [
                    {
                        name: 'Physics',
                        y: p
                    },
                    {
                        name: 'Chemistry',
                        sliced: true,
                        selected: true,
                        y: c
                    },
                    {
                        name: 'Maths',
                        y: m
                    },
                    
                ]
            }
        ]
    });
    // Graph End

    }
}