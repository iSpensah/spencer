"use strict";

let sortDirection=false;

let eventData = [
    {EventID: 1, EventName: 'Christmas Sale', startDate: '12-15-22', endDate:'12-25-22'},
    {EventID: 2, EventName: 'Halloween Sale', startDate: '10-28-22', endDate:'11-03-22'},
    {EventID: 3, EventName: 'Black Friday Sale', startDate: '12-13-22', endDate:'12-13-22'},
    {EventID: 4, EventName: 'Summer Sale', startDate: '07-13-22', endDate:'08-13-22'},
   
   
];

window.onload = () =>{
    loadTableData(eventData);
}

function loadTableData(eventData){
    const tableBody = selectElement('.tablebody');
    let dataHtml ='';

    for (let event of eventData){
        dataHtml += `<tr>
                    <td> ${event.EventID}</td>
                    <td> ${event.EventName}</td>
                    <td class="pred"> ${event.startDate}</td>
                    <td> ${event.endDate}</td>
                    <td style="text:center"> <button class="edit" onClick="modalUpdate()"><i class="material-icons">edit</i></button>
                    <button class="delete" onClick="modalDelete()"><i class="material-icons">delete</i></button></td>
                    </tr>`;
    }

    tableBody.innerHTML = dataHtml;

}

function dynamicSort(property){
    var sortOrder = 1;
    if(property[0] === "-") {
        sortOrder = -1;
        property = property.substr(1);
    }
    return function (a,b) {
        /* next line works with strings and numbers, 
         * and you may want to customize it to your needs
        */
        var result = (a[property] < b[property]) ? -1 : (a[property] > b[property]) ? 1 : 0;
        return result * sortOrder;
    }
}

function selectElement(selector){
    return document.querySelector(selector);
}
function modalUpdate(){
    document.querySelector('.bg-modal1').style.display ='flex';
}
//Show Delete Modal
function modalDelete(){
    document.querySelector('.modal-delete').style.display ='flex';
}
//Close UpdateModal
function  modalClose(){
    document.querySelector('.bg-modal1').style.display ='none';
    document.querySelector('.modal-delete').style.display ='none';
}
//clear results in DIV
function clearResults(){
    selectElement('.tablebody').innerHTML = "";
}

function getResults(){
    const search = selectElement('.searchbtn').value;
    let noResults = true;  
    
    clearResults();

        for(let i = 0; i < eventData.length; i++){
            if(
                eventData[i].EventName.toLocaleLowerCase().includes(search.toLocaleLowerCase())
                
            ){
              
                noResults = false;
                selectElement('.tablebody').innerHTML += `<tr>
                <td> ${eventData[i].EventID}</td>
                <td> ${eventData[i].EventName}</td>
                <td> ${eventData[i].startDate}</td>
                <td> ${eventData[i].endDate}</td>
                <td style="text:center"> <button class="edit" onClick="modalUpdate()"><i class="material-icons">edit</i></button>
                <button class="delete" onClick="modalDelete()"><i class="material-icons">delete</i></button></td>
                </tr>`;

                
                    
            }/*else{
                selectElement('.tablebody').innerHTML += `<tr>
                <td colspan="7" style="text-align:center"> No matching records found</td>
                </tr>`;
            }*/        
        }        
      // selectElement('.tableBody').innerHTML =  noResults ? `<tr><td colspan="7" style="text-align:center"> No matching records found</td></tr>` : '';
}


selectElement('.searchbtn').addEventListener('keyup', getResults);



document.getElementById("click").addEventListener('click', 
    function(){
      document.querySelector('.bg-modal').style.display ='flex';
    });
//Close Add Product Modal
document.querySelector('.close').addEventListener('click',
    function(){
      document.querySelector('.bg-modal').style.display='none';
    });