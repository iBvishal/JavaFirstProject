let empData = [];
function addemployee(){
    let emp ={
        id : document.getElementById('empid').value,
        firstName : document.getElementById('firstname').value,
        lastname : document.getElementById('lastname').value,
        title : document.getElementById('jobtitle').value
    }
    empData.push(emp);
    document.forms[0].reset();
}

function showAll(){
    let pre = document.querySelector('#msg pre');
    pre.textContent = '\n' + JSON.stringify(empData, '\t', 2);
}

function search(){
    let result = [];
    var x = document.getElementById('searchID').value ;

    for (var i = 0; i < empData.length; i++){
        // look for the entry with a matching `code` value
        if (empData[i].firstName == x){
            result.push(empData[i]);
        }
      }
    let pre = document.querySelector('#msg pre');
    pre.textContent = '\n' + JSON.stringify(result, '\t', 2);
}