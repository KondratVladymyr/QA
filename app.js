const get_api_res_btn = document.getElementById('get_api_res_btn');
const title = document.getElementById('title');
const api_result = document.getElementById('api_result');
const api_result2 = document.getElementById('api_result2');
const api_result3 = document.getElementById('api_result3');

get_api_res_btn.addEventListener('click', getAPI);

    function getAPI(){
        let endPoint = 'http://www.omdbapi.com/?t=' + title.value + "&apikey=b69754a7";
        fetch(endPoint, {
		method: 'GET'
	})
    .then(res => res.json())
    .then(data=> {
        api_result.innerHTML=data.Title;
        api_result2.innerHTML=data.Year;
        api_result3.innerHTML=data.Director;
        
    });
}