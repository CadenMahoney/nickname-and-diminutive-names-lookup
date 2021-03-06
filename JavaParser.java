public Map<String, String> dimNames = new HashMap<String, String>();

    private void loadDiminutiveNames() {
        BufferedReader input = null;

        try {
            input = new BufferedReader(new FileReader(dimNamesFile));
            String line = null;
            while ((line = input.readLine()) != null) {
                //System.out.println("line = " + line);
                StringTokenizer st = new StringTokenizer(line, ",");
                String key = st.nextToken();
                List<String> values = new ArrayList<String>();
                while (st.hasMoreElements()) {
                    values.add(st.nextToken());
                }
                dimNames.put(key, values);
            }

        } catch (IOException ex) {
            Logger.getLogger(ThisClass.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(ThisClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
