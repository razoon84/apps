/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.webcosolution.braceletsblog.servlets;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pawel.Kowalski
 */
public class ImageServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getPathInfo() != null || !request.getPathInfo().isEmpty()) {

            String filename = request.getPathInfo().substring(1);
            File file = new File("c:\\prywatne\\Projects\\BraceletsBlog\\images", filename);

            int reqWidth = request.getParameter("width") != null ? Integer.parseInt(request.getParameter("width")) : 0;

            if (reqWidth != 0) {

                BufferedImage bimg = ImageIO.read(file);

                int imgWidth = bimg.getWidth();
                Double imgHeight = ((double) reqWidth / (double) imgWidth * bimg.getHeight());

                reqWidth = reqWidth != 0 ? reqWidth : imgWidth;

                int type = bimg.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : bimg.getType();

                BufferedImage resizedImage = new BufferedImage(reqWidth, imgHeight.intValue(), type);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(bimg, 0, 0, reqWidth, imgHeight.intValue(), null);
                g.dispose();
                g.setComposite(AlphaComposite.Src);
                g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                OutputStream os = response.getOutputStream();
                ImageIO.write(resizedImage, filename.substring(filename.lastIndexOf(".") + 1), os);

                response.setHeader("Content-Type", getServletContext().getMimeType(filename));
                response.setHeader("Content-Disposition", "inline; filename=\"" + filename + "\"");

                os.close();

            } else {
                response.setHeader("Content-Type", getServletContext().getMimeType(filename));
                response.setHeader("Content-Length", String.valueOf(file.length()));
                response.setHeader("Content-Disposition", "inline; filename=\"" + filename + "\"");
                Files.copy(file.toPath(), response.getOutputStream());
            }

        }
    }

}
