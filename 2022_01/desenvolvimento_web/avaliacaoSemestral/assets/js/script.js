$(document).ready( () => {

    $('section').load('pages/home.html')
    $('#menuHome').addClass('active')

    function clearClass() {
        $('#menuHome').removeClass('active')
        $('#menuAbout').removeClass('active')
        $('#menuServices').removeClass('active')
        $('#menuContact').removeClass('active')
    }

    $('#menuHome').click(()=>{
        clearClass()
        $('#menuHome').addClass('active')
        $('section').load('pages/home.html')
    })

    $('#menuAbout').click(()=>{
        clearClass()
        $('#menuAbout').addClass('active')
        $('section').load('pages/about.html')
    })

    $('#menuServices').click(()=>{
        clearClass()
        $('#menuServices').addClass('active')
        $('section').load('pages/services.html')
    })

    $('#menuContact').click(()=>{
        clearClass()
        $('#menuContact').addClass('active')
        $('section').load('pages/contact.html')
    })

})