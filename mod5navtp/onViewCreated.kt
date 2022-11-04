override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textEditName = view.findViewById<EditText>(R.id.editTextNameRed)

        textEditName.setOnKeyListener(View.OnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                val choice = (1..2).random()
                if (choice == 1 ){
                    Navigation.findNavController(view).navigate(R.id.orangeFragment)
                } else {
                    Navigation.findNavController(view).navigate(R.id.blueFragment)
                }
                return@OnKeyListener true
            }
            false
        })
    }