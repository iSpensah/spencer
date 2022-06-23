"use strict";

let sortDirection=false;

let couponData = [
    {CouponID: 1, CouponName: 'XMASCOUPON', EventName: 'Christmas Sale', Discount: '25%'},
    {CouponID: 2, CouponName: 'HALLOWEEN', EventName: 'Holloween Sale', Discount: '15%'},
    {CouponID: 3, CouponName: 'BLKFDAY', EventName: 'Black Friday Sale', Discount: '75%'},
   
];

window.onload = () =>{
    loadTableData(couponData);
}

function loadTableData(couponData){
    const tableBody = selectElement('.tablebody');
    let dataHtml ='';

    for (let coupon of couponData){
        dataHtml += `<tr>
                    <td> ${coupon.CouponID}</td>
                    <td> ${coupon.CouponName}</td>
                    <td class="pred"> ${coupon.EventName}</td>
                    <td> ${coupon.Discount}</td>
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

        for(let i = 0; i < couponData.length; i++){
            if(
                couponData[i].CouponName.toLocaleLowerCase().includes(search.toLocaleLowerCase()) ||
                CouponData[i].EventName.toLocaleLowerCase().includes(search.toLocaleLowerCase())
                
            ){
              
                noResults = false;
                selectElement('.tablebody').innerHTML += `<tr>
                <td> ${couponData[i].CouponID}</td>
                <td> ${couponData[i].CouponName}</td>
                <td> ${couponData[i].EventName}</td>
                <td> ${couponData[i].Discount}</td>
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



document.getElementById('click').addEventListener('click', 
    function(){
      document.querySelector('.bg-modal').style.display ='flex';
    });
//Close Add Product Modal
document.querySelector('.close').addEventListener('click',
    function(){
      document.querySelector('.bg-modal').style.display='none';
    });