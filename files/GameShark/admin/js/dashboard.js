"use strict";

let sortDirection = false;
let productData = [
    {productID: 1, productName: 'Dota 2', category: 'MOBA', price: 1500,  companyName: 'Valve', stock: 12345, image: "null"},
    {productID: 2, productName: 'Call of Duty', category: 'FPS', price: 1300, companyName: 'Activision', stock: 12345, image: "null"},
    {productID: 3, productName: 'Mobile Legends', category: 'MOBA', price: 800, companyName: 'Moontoon', stock: 12345, image: "null"},
    {productID: 4, productName: 'PlayerUnknowns Battlegrounds', category: 'FPS', price: 1400, companyName: 'PUBG Studios', stock: 12345, image: "null"},
    {productID: 5, productName: 'CS: Go', category: 'FPS', price: 1350, companyName: 'Valve', stock: 12345, image: "null"},
    {productID: 6, productName: 'Dota 1', category:'MOBA', price: 1100, companyName: 'Blizzard', stock: 12345, image: "null"},
    {productID: 7, productName: 'Minecraft', category: 'Survival', price: 900, companyName: 'Monjang Studios', stock: 12345, image: "null"},
    {productID: 8, productName: 'Fortnite', category: 'Third Person Shooting', price: 1300, companyName: 'Epic Games', stock: 12345, image: "null"},
];

window.onload = () =>{
    loadTableData(productData);
};

function loadTableData(productData){
    const tableBody = selectElement('.tablebody');
    let dataHtml = '';

    for (let product of productData){
        dataHtml += `<tr>
                    <td> ${product.productID}</td>
                    <td> ${product.productName}</td>
                    <td> ${product.category}</td>
                    <td class="pred"> $${product.price}</td>
                    <td> ${product.companyName}</td>
                    <td> ${product.stock}</td>
                    </tr>`;
    }

    tableBody.innerHTML = dataHtml;
}

//Sorting
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

//select elements passed in
function selectElement(selector){
    return document.querySelector(selector);
}

//clear results in DIV
function clearResults(){
    selectElement('.tablebody').innerHTML = "";
}
//Show Update Modal
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
//Search Button
function getResults(){
    const search = selectElement('.searchbtn').value;
    let noResults = true;  
    
    clearResults();

        for(let i = 0; i < productData.length; i++){
            if(
                productData[i].productName.toLocaleLowerCase().includes(search.toLocaleLowerCase()) ||
                productData[i].companyName.toLocaleLowerCase().includes(search.toLocaleLowerCase())
                
            ){
              
                noResults = false;
                selectElement('.tablebody').innerHTML += `<tr>
                <td> ${productData[i].productID}</td>
                <td> ${productData[i].productName}</td>
                <td> ${productData[i].category}</td>
                <td class="pred"> ${productData[i].price}</td>
                <td> ${productData[i].companyName}</td>
                <td> ${productData[i].stock}</td>
                <td> ${productData[i].image}</td>
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

//Show Add Product Modal
document.getElementById('click').addEventListener('click', 
    function(){
      document.querySelector('.bg-modal').style.display ='flex';
    });
//Close Add Product Modal
document.querySelector('.close').addEventListener('click',
    function(){
      document.querySelector('.bg-modal').style.display='none';
    });



