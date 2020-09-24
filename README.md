# SignUpForm
This program takes four inputs- email, name, password, and confirmed password- and makes sure that data was
provided for all four, and that the passwords match. In the layout, the four labels and the four inputs are
evenly spaced out. The four inputs were all constrained using the right edge of the screen and the edge of
the longest label, the password, so all four are of identical length and horizontal coordinates. They are
all vertically aligned by the tops of their respective labels, so both sides are evenly spaced.

To check for errors, the button calls a private method which retrieves the text from the four inputs as 
Strings. To make sure all fields are filled in, they are checked using the isEmpty method, while the
two password attempts are compared using the isEquals method. If there is an error, the user is
informed with a Toast, otherwise the Toast greets them by the name they entered.

[Screenshot](https://raw.githubusercontent.com/tuj12239/SignUpForm/master/Screenshot_1600906105.png)
