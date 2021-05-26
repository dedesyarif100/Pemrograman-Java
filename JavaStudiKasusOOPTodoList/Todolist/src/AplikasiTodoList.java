// package StudiKasusOOPTodolist;

public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        testViewShowTodoList();
    }

    public static void showTodoList() {
        System.out.println("TODO LIST");
        System.out.println("----------------------------");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;
            
            if (todo != null) {
                System.out.println(no + ". " + todo);
            } else {
                System.out.println("Tidak ada Todo List");
                break;
            }
        }
        System.out.println("----------------------------");
    }

    public static void testShowTodoList() {
        // String[] model = {"aaa", "bb", "cc"};
        model[0] = "aaa";
        model[1] = "bbb";
        model[2] = "ccc";
        model[3] = "ddd";
        model[4] = "eee";
        model[5] = "fff";
        showTodoList();
    }

    public static void testViewShowTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();
    }

    public static void addTodoList(String todo) {
        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, kita resize ukuran array 2x lipat
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // Tambahkan ke posisi yang data array nya NULL
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 100; i++) {
            addTodoList("Contoh Todo Ke - " + i);
        }

        showTodoList();
    }

    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            System.out.println("Data Tidak Ditemukan guys");
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            // model[number - 1] = null; // Logic ini salah
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        // addTodoList("Satu");
        // addTodoList("Dua");
        // addTodoList("Tiga");
        // addTodoList("Empat");
        // addTodoList("Lima");
        for (int i = 1; i <= 10; i++) {
            addTodoList("Angka " + i);
        }

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        result = removeTodoList(3);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println("Channel " + channel);
    }

    public static void viewShowTodoList() {
        while (true) {
            showTodoList();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x") || input.equals("X")) {
                break;
            } else {
                System.out.println("Pilihan Tidak Dimengerti");
            }
        }
    }

    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");
        System.out.println("---------------------------");
        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x") || todo.equals("X")) {
            // batal
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();
        showTodoList();
    }

    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODOLIST");
        System.out.println("-----------------------------");
        var number = input("Nomor yang dihapus (x Jika Batal)");

        if (number.equals("x")) {
            // batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("------------------------------------");
                System.out.println("Gagal menghapus TodoList : " + number);
                System.out.println("------------------------------------");
                System.out.println();
            }
        }
    }

    public static void testViewRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
