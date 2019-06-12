package ma.projet.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ma.projet.entity.Images;
import ma.projet.repository.ImageRepository;

@Primary
@Service
public class TestService {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private ServletContext context;
	@Autowired
	private ImageRepository imageRepository;

	public void saveImage(MultipartFile file) throws Exception {

		boolean isExist = new File(context.getRealPath("/photos/")).exists();
		System.out.println("PATH: "+context.getRealPath("/photos/"));
		if (!isExist) {
			new File(context.getRealPath("/photos/")).mkdir();
		}
		System.out.println(context.getRealPath("/photos/"));

		String filename = file.getOriginalFilename();
		String modifiedFileName = FilenameUtils.getBaseName(filename) + "_" + System.currentTimeMillis() + "."
				+ FilenameUtils.getExtension(filename);
		System.out.println(modifiedFileName);
		System.out.println(file.getOriginalFilename());
		System.out.println((context.getRealPath("/photos/" + File.separator + modifiedFileName)));
		imageRepository.save(new Images(modifiedFileName));
		File serverfile = new File(context.getRealPath("/photos/" + File.separator + modifiedFileName));

		try {
			FileUtils.writeByteArrayToFile(serverfile, file.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

//	public List<Images> getPhotos() throws Exception {
////		List<Images> imgs = new ArrayList<>();
//
//		for (Images img : imageRepository.findAll()) {
//			System.out.println(context.getRealPath("/photos/") + img.getImg());
//			img.setImg(context.getRealPath("/photos/") + img.getImg());
//			System.out.println(img.getImg());
//
//		}
//
//		return imageRepository.findAll();
//	}

//	public List<Images> getImages() throws Exception {
//		List<Images> imgs = new ArrayList<>();
//		String filesPath = context.getRealPath("/photos/");
//		File fileFolder = new File(filesPath);
//		if (fileFolder != null) {
//
//			for (Images file : imageRepository.findAll()) {
//				String encodeBase64 = null;
//				try {
//					String extension = FilenameUtils.getExtension(file.getImg());
//					System.out.println("extension :" + extension);
//					FileInputStream fileInputStream = new FileInputStream(file.getImg());
//					System.out.println("fileInputStream :" + fileInputStream);
//
//					byte[] bytes = new byte[file.getImg().length()];
//					System.out.println("bytes :" + bytes);
//
//					fileInputStream.read(bytes);
//					System.out.println("fileInputStream :" + fileInputStream);
//					encodeBase64 = Base64.getEncoder().encodeToString(bytes);
//					file.setImg("data:image/" + extension + ";base64," + encodeBase64);
//					imgs.add(file.getImg());
//
//					fileInputStream.close();
//
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//			}
//
//		}
//
//		return imgs;
//	}

	public List<Images> getImges() throws Exception {
		List<Images> imgs = new ArrayList<>();
		String filesPath = context.getRealPath("/photos/");
		File fileFolder = new File(filesPath);
		System.out.println("fileFolder :" + fileFolder);

		if (fileFolder != null) {
			for (final Images f : imageRepository.findAll()) {
				System.out.println("file :" + f);
				File file = new File(filesPath+f.getImg());
				if (!file.isDirectory()) {
					String encodeBase64 = null;
					try {
						String extension = FilenameUtils.getExtension(file.getName());
						System.out.println("extension :" + extension);
						FileInputStream fileInputStream = new FileInputStream(file);
						System.out.println("fileInputStream :" + fileInputStream);

						byte[] bytes = new byte[(int) file.length()];
						System.out.println("bytes :" + bytes);

						fileInputStream.read(bytes);
						System.out.println("fileInputStream :" + fileInputStream);
						encodeBase64 = Base64.getEncoder().encodeToString(bytes);
						String img = "data:image/" + extension + ";base64," + encodeBase64;
						imgs.add(new Images(f.getId(),img));

						fileInputStream.close();

					} catch (Exception e) {
						// TODO: handle exception
					}
				}

			}
		}

		return imgs;
	}

	// String rpath = request.getRealPath("/");
//    System.out.println(rpath);
//
//    rpath = rpath + "/" + imageFile; // whatever path you used for storing the file
//    System.out.println(rpath);
//    Path path = Paths.get(rpath);
//    System.out.println(path);
//    byte[] data = Files.readAllBytes(path); 
//    System.out.println(data);

//
//String realPathtoUploads =  request.getServletContext().getRealPath(folder);
//if(! new File(realPathtoUploads).exists())
//{
//    new File(realPathtoUploads).mkdir();
//}
//System.out.println(realPathtoUploads);
//
//String orgName = imageFile.getOriginalFilename();
//String filePath = realPathtoUploads + orgName;
//System.out.println(realPathtoUploads);
////File dest = new File(filePath);
////imageFile.transferTo(dest);

//String folder = "/photos/";
//byte[] bytes = imageFile.getBytes();
//Path path = Paths.get(folder + imageFile.getOriginalFilename());
//System.out.println(path.getFileName() + "" + imageFile.getOriginalFilename() + "" + imageFile.getResource());
//Files.write(path, bytes);
}
