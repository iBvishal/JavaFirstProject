
    function check(name) {
      document.getElementById("answer").value = "";

      var num1 = document.getElementById("num1").value;
      var num2 = document.getElementById("num2").value;
      num1 = parseInt(num1, 10);
      num2 = parseInt(num2, 10);
      var result;
      if(name=="add"){
        result = num1+num2;
      }
      else if(name=="sub"){
        result = num1-num2;
      }
      else if(name=="mul"){
        result = num1*num2;
      }
      else{
        result = num1/num2;
      }
      document.getElementById("answer").value  = result;
    }