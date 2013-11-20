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
        $('#messages').html(player0 +"'s move").attr('class', 'alert alert-success');
        $('.cell').html("&nbsp;");
        $('#btn').html("Restart Game")
        $('.overlay').remove();
      }).fail(function(){
        $('#messages').html('An error occurred.').attr('class', 'alert alert-danger');
      });
    }
    e.preventDefault();
  });

  $("#tictactoe tr td").click(function(){
    
    var cellText = $("#" + this.id).text();
    if(cellText != "X" && cellText != "O")
    {
      $.ajax({
        type: "POST",
        url: "/click",
        data: 'cell=' + (this.id)
        }).done(function(result){
        $('#messages').html(result.substring(3)).attr('class', 'alert alert-success');
        $('#cell'+ result[1]).text(result[2]);
        if(result[0] == "F")
        {
          var overlay = $('<div/>').addClass('overlay').append($('<p/>').text('Finished')).append($('<p/>').text(result.substring(3))).append($('<p/>').text('Click "Restart Game" to play again.'));
          $(overlay).appendTo('#gameboard');
        }
        }).fail(function(){
        $('#messages').html('An error occurred.').attr('class', 'alert alert-danger');
        });
    }
  });
});
    