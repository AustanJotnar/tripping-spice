$(document).ready(function(){
  var form = $('form');
  form.submit(function(e){
    var player0 = $("#player0").val();
    var player1 = $("#player1").val();
    if(player0 != "" && player1 != "")
    {
      $.ajax({
        type: form.attr('method'),
        url: form.attr('action'),
        data: 'player0=' + player0 + '&player1=' + player1
      }).done(function(result){
        $('#test').html(result).attr('class', 'alert alert-success');
      }).fail(function(){
        $('#test').html('An error occurred.').attr('class', 'alert alert-danger');
      });
    }
    e.preventDefault();
  });


$("#tictactoe tr td").click(function(){
  $.ajax({
    type: "POST",
    url: "/click",
    data: 'cell=' + (this.id)
  }).done(function(result){
    $('#test').html(result).attr('class', 'alert alert-success');
  }).fail(function(){
    $('#test').html('An error occurred.').attr('class', 'alert alert-danger');
});

});
});
    