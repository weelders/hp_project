const active_path_array = window.location.pathname.split('/');
const element = document.getElementById(active_path_array[1]);
if (!element) {
    document.getElementById("index").classList.add("active");
}else{
    document.getElementById(active_path_array[1]).classList.add("active");
}