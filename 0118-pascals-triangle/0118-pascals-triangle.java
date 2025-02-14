class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer>PascalList = new ArrayList<>();
        List<List<Integer>>PascalTriangle = new ArrayList<>();

        PascalList.add(1);
        PascalTriangle.add(PascalList);

        if (numRows == 1) return PascalTriangle; 

        PascalList = new ArrayList<>();
        PascalList.add(1);
        PascalList.add(1);
        PascalTriangle.add(PascalList);

        for(int i=2; i<numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for(int j=1; j<i; j++) {
                newRow.add(PascalList.get(j-1)+PascalList.get(j));
            }
            newRow.add(1);
            PascalTriangle.add(newRow);
            PascalList = newRow;
        }

        return PascalTriangle;
    }
}