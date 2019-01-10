
      // Form validation code will come here.
      function validateForm() {
      
         if( document.feedback.names.value == "" ) {
            alert( "Please provide your name!" );
            document.feedback.names.focus() ;
            return false;
         }
         if( document.feedback.email.value == "" ) {
            alert( "Please provide your email!" );
            document.feedback.email.focus() ;
            return false;
         }
         if( document.feedback.phone.value == "" || isNaN( document.feedback.phone.value ) ||
            document.feedback.phone.value.length != 10) {
            
            alert( "Please provide a phone number in the format #####." );
            document.feedback.phone.focus() ;
            return false;
         }
         return( true );
      }

      // function vadidateLogin() {
         // if(document.loginForm.username.value == "") {
         //    alert("Vui lòng điền tên tài khoản");
         //    document.loginForm.username.focus() ;
         //    return false;
         // }
         function validateLogin() {
            if (document.form["loginForm"]["username"].value == "") {
              alert("Name must be filled out");
              return false;
            }
          }
         if(document.form["loginForm"]["password"].value== "") {
            alert("Vui lòng điền mật khẩu");
            return false;
         }

   //-->
   // var email = document.getElementById('txtEmail');
   //  var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

   //  if (!filter.test(email.value)) {
   //  alert('Please provide a valid email address');
   //  email.focus;
   //  return false;
   