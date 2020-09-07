package candidateRecruting.recruitment;

import candidateRecruting.candidate.Candidate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {




        List<Candidate> candidates = readCandidatesFromJsonFile();


        Company company = new Company("SDA Recruiting", candidates);
        company.recruiting();

        writeCandidatesToTxtFile(candidates);
        writeCandidatesToJsonFile(candidates);

    }

    public static void writeCandidatesToTxtFile(List<Candidate> candidates) {
        try(
                BufferedWriter writer = new BufferedWriter(new FileWriter("candidati-acceptati.txt"))) {
            writer.write(candidates.toString());
        }catch (IOException e) {
            System.out.println("Could not write to file.");
        }

    }
    public static void writeCandidatesToJsonFile(List<Candidate> candidates) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.writeValue(new File("candidati-aceptati.json"), candidates);

    }
    public static List<Candidate> readCandidatesFromJsonFile() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        List<Candidate> candidates =
                objectMapper.readValue(new File("candidati-initiali.json"),
                        new TypeReference<List<Candidate>>(){});

        return candidates;
    }
}
