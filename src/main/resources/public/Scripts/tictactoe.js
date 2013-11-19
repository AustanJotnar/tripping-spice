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
        $('#test').html(player0 +"'s move").attr('class', 'alert alert-success');
        $('.cell').html("&nbsp;");
        $('#overlay').remove();
      }).fail(function(){
        $('#test').html('An error occurred.').attr('class', 'alert alert-danger');
      });
    }
    e.preventDefault();
  });

  var overlay = '<div id="overlay">'+ '<p id="overlay-messages"> Finished </p>' + '</div>';

  $("#tictactoe tr td").click(function(){
    
    var cellText = $("#" + this.id).text();
    if(cellText != "X" && cellText != "O")
    {
      $.ajax({
        type: "POST",
        url: "/click",
        data: 'cell=' + (this.id)
        }).done(function(result){
        $('#test').html(result.substring(3)).attr('class', 'alert alert-success');
        $('#cell'+ result[1]).text(result[2]);
        if(result[0] == "F")
        {
          $(overlay).appendTo('#gameboard');
        }
        }).fail(function(){
        $('#test').html('An error occurred.').attr('class', 'alert alert-danger');
        });
    }
  });
});
    